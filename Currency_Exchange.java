import java.util.Scanner;

public class Currency_Exchange
{
    public static void main(String[] args) 
    {

    
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose one from the following");
        System.out.println("1. USD to Euro's");
        System.out.println("2. Euro's to USD");
        System.out.println("3. USD to Rupee");
        System.out.println("4. Rupee to USD");
        System.out.println("5. USD to Pounds");
        System.out.println("6. Pounds to USD");
        System.out.println("7. Mexican Peso to USD");
        System.out.println("8. USD to Mexican Peso");
        System.out.println("9. Japanese Yen to USD");
        System.out.println("10. USD to Japanese Yen");
        int exchange = sc.nextInt();
        switch(exchange) {
            case 1: {
                System.out.println("Enter the number of USD to exchange");

                double usd = sc.nextDouble();
                if(usd > 0) {
                    System.out.println(usd + "USD is " + usd*1.0 + " Euros. ");

                }
                else {
                    System.out.println("Please put in positive numbers of USD.");
                }

            }
            break;
            case 2: {
                System.out.println("Enter the number of Euros");
                double euro = sc.nextDouble();
                if(euro > 0) {
                    System.out.println(euro + " Euros is " + euro*1 + " USD. ");
                }
                else{
                    System.out.println("Please put in positive numbers of Euros.");
                }
            }
            break;
            case 3: {
                System.out.println("Enter the number of USD to exchange");
                double usd = sc.nextDouble();
                if(usd > 0) {
                    System.out.println( usd + " USD is " + usd*82.1 + "rupees. ");
                }
                else{
                    System.out.println("Please put in positive numbers of USD."); 
                }
            }
            break;    
        case 4: {
                        System.out.println("Enter the number of Rupees");
                double rupees = sc.nextDouble();
                if(rupees > 0) {
                    System.out.println(rupees + " Rupees is " + rupees*0.0121 + "USD. ");
                }
                else{
                    System.out.println("Please put in positive numbers of Ruppes.");
                }
            }
            break;
            case 5: {
                System.out.println("Enter the number of USD");
                double usd = sc.nextDouble();
                if(usd > 0) {
                    System.out.println(usd + " USD is " + usd*0.88 + " Pounds. ");
                }
                else{
                    System.out.println("Please put in positive numbers of USD.");
                }
            }
            break;
            case 6: {
                System.out.println("Enter the number of Pounds");
                double pounds = sc.nextDouble();
                if(pounds > 0) {
                    System.out.println(pounds + " Pounds is " + pounds*1.13 + " USD. ");
                }
                else{
                    System.out.println("Please put in positive numbers of Pounds.");
                }
            }
            break;
            case 7: {
                System.out.println("Enter the number of MXN");
                double mxn = sc.nextDouble();
                if(mxn > 0) {
                    System.out.println( mxn + " Mexican Peso is " + mxn*0.0499 + " USD. ");
                }
                else{
                    System.out.println("Please put in positive numbers of MXN.");
                }
            }
            break;
            case 8: {
                System.out.println("Enter the number of USD");
                double usd = sc.nextDouble();
                if(usd > 0) {
                    System.out.println(usd + " Mexican Peso is " + usd*0.050 + " USD. ");
                }
                else{
                    System.out.println("Please put in positive numbers of USD.");
                }
            }
            break;
            case 9: {
                System.out.println("Enter the number of JPY");
                double jpy = sc.nextDouble();
                if(jpy > 0) {
                    System.out.println(jpy + " Japanese Yen is " + jpy*0.0067 + " USD. ");
                }
                else{
                    System.out.println("Please put in positive numbers of JPY.");
                }
            }
            break;
            case 10: {
                System.out.println("Enter the number of USD");
                double usd = sc.nextDouble();
                if(usd > 0) {
                    System.out.println(usd + " USD is " + usd*148.7 + " JPY. ");
                }
                else{
                    System.out.println("Please put in positive numbers of USD.");
                }
            }
            break;
        }
        sc.close();
    }
}
    