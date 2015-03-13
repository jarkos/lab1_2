package pl.com.bottega.ecommerce.sales.domain.payment;

import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.Id;
import pl.com.bottega.ecommerce.sharedkernel.Money;

public class FactoryOfPayment 
{
	public static Payment paymentCreate(Id aggregateId, ClientData clientData, Money amount)
	{
		Payment payment = new Payment(aggregateId,clientData,amount);
		return payment;
		
	}
}
