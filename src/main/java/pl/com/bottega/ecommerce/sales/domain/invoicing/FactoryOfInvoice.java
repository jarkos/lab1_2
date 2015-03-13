package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.Id;
import pl.com.bottega.ecommerce.sales.domain.invoicing.Invoice;

public class FactoryOfInvoice {
	
	public static Invoice invoceCreate(Id id, ClientData client) {
		Invoice invoice = new Invoice(id, client);
		return invoice;
	}
	
}
