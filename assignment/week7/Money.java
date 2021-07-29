public class Money {
    private int dollar;
    private int cent;

    public Money(int dollar, int cent) {
        this.dollar=dollar;
        this.cent=cent;
    }

    public Money(String dollar) {

        String[] money = dollar.split("\\.");
        money[0] = money[0].replace("$","");

        this.dollar = Integer.parseInt(money[0]);
        this.cent = Integer.parseInt(money[1]);

    }
    public Money add(Money cc) {

        int centc = this.cent + cc.cent;
        int count = 0;

        if(centc >= 100){
            count = centc / 100;
            centc = centc % 100;
        }

        int dollard = this.dollar + cc.dollar + count;
        Money result = new Money(dollard,centc);
        return result;

    }

   
    public String toString() {
        return Integer.toString(dollar) + "달러" + Integer.toString(cent) + "센트";
    }
}