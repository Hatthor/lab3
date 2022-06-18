package c;

public class Ex4_20 {
    private static double bHour = 40.00;
    private static double rate = 1.5;

    private double hours, pay;
    public void setHours(double hours){
        this.hours = hours;
    }
    public void setHourlyPay(double pay){
        this.pay = pay;
    }
    public double calculateGPay(){
        return hours > 40 ?
                (pay * bHour) + ((pay * rate) * (hours - bHour)) :
                hours * pay;
    }
}
