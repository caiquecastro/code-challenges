import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class main {
	public static void main(String[] args) {
		BufferedReader in;
		String str;
		char matrix[][] = new char[100][80];
		char currentChar;
		int starCount[] = new int[100];
		int i = 0, j, strLen = 0, rowsCount, starTotal;

		try {
			if (args.length == 0) {
				System.err.println("You must provide the input file");
				return;
			}

			try {
				in = new BufferedReader(new FileReader(args[0]));
			} catch (FileNotFoundException e) {
				System.err.println("Invalid file provided");
				return;
			}

			while (true) {

				if ((str = in.readLine()) == null) {
					// System.out.println("Fim do arquivo");
					break;
				}

				// System.out.println("Começando a ler ");
				i = 0;

				while(true) {
					if (str == null || str.equals("")) {
						// System.out.println("Fim de leitura de log " + i);
						break;
					}

					strLen = str.length();
					starCount[i] = 0;
					for (j = 0; j < strLen; j++) {
						currentChar = str.charAt(j);

						if (currentChar == '*') {
							starCount[i]++;
						}

						matrix[i][j] = currentChar;
					}
					i++;

					str = in.readLine();
				}

				starTotal = 0;
				rowsCount = i;

				// System.out.println("Imprimindo resultado com " + rowsCount);

				for (i = 0; i < rowsCount; i++) {
					for (j = 0; j < strLen - starCount[i] - starTotal; j++) {
						System.out.print('.');
					}
					for (j = 0; j < starCount[i]; j++) {
						System.out.print('*');
					}
					for (j = strLen - starTotal; j < strLen; j++) {
						System.out.print('.');
					}
					System.out.println();
					starTotal += starCount[i];
				}
				// System.out.println("Fim de impressão de resultado");
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
