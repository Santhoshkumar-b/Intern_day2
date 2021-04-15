package com.santhoshkumar;

public class micro {
public double fareprices_micro(int fare,int hour,int age) {
		
		if(hour<17 || hour>19)
		{
			int price = fare * firstpage.micro_price;
			double gst=(price*firstpage.gst_cabs)/100.0;
			System.out.println("Your Estimated price: " +(price+gst));
			firstpage.total_tariff=price+gst;
			if(age>=60)
			{
				double senior_citizen=(firstpage.total_tariff*50)/100.0;
				return(firstpage.total_tariff-senior_citizen);
				
			}
			return (price+gst);
		}
		else {
			double peak_prices=(firstpage.micro_price*firstpage.peak_price)/100.0;
			double price=(fare*firstpage.micro_price)+peak_prices;
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


