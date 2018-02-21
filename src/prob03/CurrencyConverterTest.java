package prob03;

public class CurrencyConverterTest {

	public static void main(String[] args) {
		//  환율을 세팅 합니다.
		CurrencyConverter.setRate(1121);
		
		System.out.println(
				String.format("백만원은 %f달러입니다.", CurrencyConverter.toDollar(1000000)));
		System.out.println(
				String.format("천달러는 %f원입니다.", CurrencyConverter.toKRW(1000)));
	}
}
