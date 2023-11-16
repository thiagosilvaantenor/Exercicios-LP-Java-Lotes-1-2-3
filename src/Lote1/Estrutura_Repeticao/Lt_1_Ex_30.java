package Lote1.Estrutura_Repeticao;
import java.util.Scanner;

public class Lt_1_Ex_30 {
	/*
	 * 30. Receba a data de nascimento e atual em ano, mês e dia. Calcule e mostre a
	 * idade em anos, meses e dias, considerando os anos bissextos.
	 */
	static int anoNasc, mesNasc, diaNasc, anoAt, mesAt, diaAt;
	static int anoTotal, mesTotal;

	public static void main(String[] args) {
		CarregaDados();
		CalcDiasAno();
		CalcDiasMes();

		// mostra resultado
		System.out.println(
				"Sua idade em anos: " + anoTotal + ", já sua idade em meses: " + mesTotal + ", e em dias: " + CalcDias());

	}

	static void CarregaDados() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe ano, mes e dia de nascimento");
		anoNasc = sc.nextInt();
		mesNasc = sc.nextInt();
		diaNasc = sc.nextInt();
		System.out.println("Agora informe o ano, mes e dia atuais");
		anoAt = sc.nextInt();
		mesAt = sc.nextInt();
		diaAt = sc.nextInt();
		sc.close();
	}

	static void CalcDiasAno() {
		// em anos
		anoTotal = anoAt - anoNasc;
	}

	static void CalcDiasMes() {
		// em meses
		if (mesNasc > mesAt) {
			anoTotal = anoTotal - 1;
			mesTotal = (anoTotal * 12) + mesAt;
		} else {
			mesTotal = (anoTotal * 12) - (12 - mesAt);
		}
	}

	static int CalcDias() {
		// em dias
		int diaTotal = 0;

		// 31:jan,mar�o,maio,julho,agosto,outubro,dezembro
		// 28:fev
		// 30:abril,junho,setembro,novembro

		// verificar se os meses do ano atual tem 30,31,ou 28 dias

		for (int i = 1; i < mesAt; i++) {
			if (i != mesAt) {
				switch (i) {
					case 1:
					case 3:
					case 5:
					case 7:
					case 8:
					case 10:
					case 12:
						diaTotal = diaTotal + 31;
						break;
					case 2:
						if (anoAt % 4 == 0 && anoAt % 100 < 0) {
							diaTotal = diaTotal + 29;
						} else {
							if (anoAt % 4 == 0 && anoAt % 100 == 0 && anoAt % 400 == 0) {
								diaTotal = diaTotal + 29;
							} else {
								diaTotal = diaTotal + 28;
							}
						}
						break;
					default:
						diaTotal = diaTotal + 30;
						break;
				}
			} else {
				diaTotal = diaTotal + diaAt;
			}
		}

		// verifica a quantidade de dias no ano de nascimento
		// retira os dias do m�s do nascimento
		for (int i = mesNasc; i <= 12; i++) {
			switch (i) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					if (mesNasc == i) {
						diaTotal -= (31 - diaNasc);
					} else {
						diaTotal = diaTotal + 31;
					}
					break;
				case 2:
					if (anoNasc % 4 == 0 && anoNasc % 100 < 0) {
						if (mesNasc == i) {
							diaTotal -= (29 - diaNasc);
						} else {
							diaTotal = diaTotal + 29;
						}
					} else {
						if (anoNasc % 4 == 0 && anoNasc % 100 == 0 && anoNasc % 400 == 0) {
							if (mesNasc == i)
								diaTotal -= (29 - diaNasc);
							else
								diaTotal = diaTotal + 29;
						} else {
							if (mesNasc == i)
								diaTotal -= (28 - diaNasc);
							else
								diaTotal = diaTotal + 28;
						}
					}
					break;
				default:
					if (mesNasc == i)
						diaTotal -= (30 - diaNasc);
					else
						diaTotal = diaTotal + 30;
					break;
			}
		}
		// verifica se o ano � bissexto e adiciona os dias de acordo
		for (int i = anoNasc + 1; i < anoAt; i++) {

			if (i % 4 == 0 && i % 100 < 0) {
				diaTotal += 366;
			} else {
				if (i % 4 == 0 && i % 100 == 0 && i % 400 == 0) {
					diaTotal += 366;
				} else {
					diaTotal += 365;
				}
			}
		}
		return diaTotal;
	}
}
