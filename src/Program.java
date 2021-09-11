import test.Arquivo;
import test.Serializacao;
import test.UnicodeEncoding;

import java.io.IOException;

public class Program {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        System.out.println("--------------------------------");
        System.out.println("Arquivo");
        System.out.println("--------------------------------");
        Arquivo.test();
        System.out.println("--------------------------------");
        System.out.println("Serializacao");
        System.out.println("--------------------------------");
        Serializacao.test();
        System.out.println("--------------------------------");
        System.out.println("UnicodeEncoding");
        System.out.println("--------------------------------");
        UnicodeEncoding.test();
    }
}
