package test;

import java.io.*;

public class Arquivo {

    public static void test() throws IOException {

        System.out.println("Lendo texto A...");
        InputStream fileInputStream = new FileInputStream("assets/textoA.txt");
        Reader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("Preparando texto B...");
        OutputStream fileOutputStream = new FileOutputStream("assets/textoB.txt");
        Writer outputStreamWriter = new OutputStreamWriter(fileOutputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

        String linha = bufferedReader.readLine();

        bufferedWriter.write("Copiando a informação do texto A para o texto B.");
        bufferedWriter.newLine();
        bufferedWriter.newLine();

        System.out.println("Copiando as linhas do A para o B...");

        while (!(linha == null || linha.isEmpty())) {
            bufferedWriter.write(linha);
            bufferedWriter.newLine();
            bufferedWriter.flush();

            linha = bufferedReader.readLine();
        }

        bufferedReader.close();
        bufferedWriter.close();

        System.out.println("Verificar resultados em assets...");
    }
}
