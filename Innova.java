package com.santhoshkumar;

public class Innova {
	public double fareprices_innova(int fare,int hour,int age)
	{
		if(hour<17 && hour>19)
		{
			int price=fare*20;
			double gst=(price*firstpage.gst_cabs)/100.0;
			System.out.println("Your fare price: "+(price+gst));
			firstpage.total_tariff=price+gst;
			if(age>=60)
			{
				double senior_citizen=(firstpage.total_tariff*50)/100.0;
				return(firstpage.total_tariff-senior_citizen);
				
			}
			return (price+gst);
		}else {
			double peak_prices=(20*firstpage.peak_price)/100.0;
			double price=(fare*20)+peak_prices;
			double gst=(price*firstpage.gst_cabs)/100.0;
			System.out.println("Your fare price: "+(price+gst));
			firstpage.total_tariff=price+gst;
			if(age>=60)
			{
				double senior_citizen=(firstpage.total_tariff*50)/100.0;
				return(firstpage.total_tariff-senior_citizen);
				
			}
			return (price+gst);		
		}
	}

}
