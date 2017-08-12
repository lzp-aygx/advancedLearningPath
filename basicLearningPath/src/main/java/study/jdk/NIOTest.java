package study.jdk;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by lizhupeng on 2017/7/25.
 */
/**
 * 相对于BIO的流，NIO抽象出了新的通道（Channel）作为输入输出的通道，并且提供了缓存（Buffer）的支持，在进行读操作时，
 * 需要使用Buffer分配空间，然后将数据从Channel中读入Buffer中，
 * 对于Channel的写操作，也需要现将数据写入Buffer，然后将Buffer写入Channel中。*/
public class NIOTest {



    //使用NIO的方式进行文件拷贝操作
    public static void copyFile(String srcFileName, String dstFileName) throws IOException {
        FileInputStream fis = new FileInputStream(srcFileName);
        FileOutputStream fos = new FileOutputStream(dstFileName);

        FileChannel readChannle = fis.getChannel();
        FileChannel writeChanle = fos.getChannel();

        ByteBuffer buffer = ByteBuffer.allocate(1024);

        while (true) {
            buffer.clear();//清空缓存区
            if (readChannle.read(buffer) == -1){
                //从输入Channel中读取数据到buffer中
                break;
            }
            buffer.flip();//将缓存区游标置于0
            writeChanle.write(buffer);//将缓存中数据写入输出Channel中
        }
        fis.close();
        fos.close();

    }
}
