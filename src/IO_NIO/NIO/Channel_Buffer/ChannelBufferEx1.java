package IO_NIO.NIO.Channel_Buffer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelBufferEx1 {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("test10.txt", "rw");
             FileChannel channel = file.getChannel();){

            ByteBuffer buffer = ByteBuffer.allocate(25);  // создали буфер на 25 капасити
            StringBuilder stix = new StringBuilder();

            int byteRead = channel.read(buffer);             // читаем информацию с помощью чанеля из файла и записываем в буфер
            while (byteRead > 0) {                           // читаем пока есть что читать
                System.out.print("| Read " + byteRead);      // выводим на экран количество прочитаных байтов

                buffer.flip();                               // кувырок назад, меняет режим буфера из режима записи в режим чтения.
                                                             // Метод clear переводит позицию на нулевую и начинает писать новые байты поверх старых бойтов.
                                                             // Внутренний лимит запоминает на каком байте была последняя запись.

                while (buffer.hasRemaining()) {              // Пока у буфера есть что читать
                    stix.append ((char)buffer.get());
                }

                buffer.clear();
                byteRead = channel.read(buffer);
            }
            System.out.println("\n" + stix);

            String text = "\nThere are only two ways to live your life. " +
                    "\nOne is as though nothing is a miracle. " +
                    "\nThe other is as though everything is a miracle.";


            // Первый способ дополнительной записи в файл

//            ByteBuffer buffer2 = ByteBuffer.allocate(text.getBytes().length);
//            buffer2.put(text.getBytes());
//            buffer2.flip();
//            channel.write(buffer2);

            // Второй способ дополнительной записи в файл с помощью метода wrap

            ByteBuffer buffer2 = ByteBuffer.wrap(text.getBytes());
            channel.write(buffer2);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
