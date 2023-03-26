package primitiveDataTypes;

import java.math.BigDecimal;

public class SimpleinterestCalculator {

	BigDecimal principal;
	BigDecimal interest;

	public SimpleinterestCalculator(String principal, String interest) {
		this.principal = new BigDecimal(principal);
		this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
	}

	public BigDecimal calculateTotalValue(int noOfYears) {
		BigDecimal totalvalue = principal.add(principal.multiply(interest)).multiply(new BigDecimal(noOfYears));
		return totalvalue;
	}

}
