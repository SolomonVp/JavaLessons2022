package IO_NIO.NIO.Channel_Buffer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelBufferEx2 {
    public static void main(String[] args) {
        try(RandomAccessFile file = new RandomAccessFile("test5.txt", "r");
            FileChannel channel = file.getChannel()) {

            ByteBuffer buffer = ByteBuffer.allocate(5);
            channel.read(buffer);
            buffer.flip();
            System.out.println((char)buffer.get());
            System.out.println((char)buffer.get());
            System.out.println((char)buffer.get());

            // метод rewind ставит position на нулевую ячейку
            buffer.rewind();
            System.out.println((char)buffer.get());
            System.out.println("------------------------------------------------------------------");

            // метод compact копирует непрочитаные байты в начало буфера, чтобы их можно было потом прочитать 0_0.
            // Следующие байты будут записываться следом на непрочитаными(перенесеными) байтами.
            buffer.compact();
            channel.read(buffer);
            buffer.flip();
            while (buffer.hasRemaining()) {
                System.out.println((char) buffer.get());
            }
            System.out.println("------------------------------------------------------------------");
            buffer.clear();
            channel.read(buffer);
            buffer.flip();
            System.out.println((char) buffer.get());
            buffer.mark();                                       // ставим отметку чтобы потом вернуться к этой позиции (h так как стоит за g)
            System.out.println((char) buffer.get());
            System.out.println((char) buffer.get());
            buffer.reset();                                      // возвращаемся к позиции h, на которой ставили метку методом .mark и выводим всё что осталось от h до конца
            while (buffer.hasRemaining()) {
                System.out.println((char) buffer.get());
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
