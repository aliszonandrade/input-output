package videoaula;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Manipulacao extends IOException{

	public void CriarArquivo() throws IOException {
		try {
			OutputStream os = new FileOutputStream("C:/video_java/ola_mundo.txt");
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter br = new BufferedWriter(osw);
			
			br.write("Hello world!");
			br.write("\nEstamos em 2020");
			br.write("\nAno de pandemia");
			
			br.close();
			
			
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	
	public void LerArquivo() throws IOException {
		try {
			InputStream stream = new FileInputStream("C:/video_java/ola_mundo.txt");
			InputStreamReader streamReader = new InputStreamReader(stream);
			BufferedReader br = new BufferedReader(streamReader);
			
			String linha = br.readLine();
			
			while (linha != null) {
				System.out.println(linha);
				linha = br.readLine();				
			}
			
			br.close();
			
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
