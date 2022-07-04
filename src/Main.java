import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static int Point=0;
    static int PointEnd=1000;
    static int BestRecord=0;
    static int Randomnum1;
    static int ResultsInt;
    static String Vvod;
    static Scanner ass = new Scanner(System.in);
    static ArrayList<Integer> Results = new ArrayList<Integer>();

    public static void main(String[] args)
    {
        Body();
    }
    public static void Body() {
        System.out.println("Выберите действие (Push/Results)");
        Vvod = ass.next();
        switch (Vvod) {
            case "Push":
                ResultsInt = Random();
                Results.add(ResultsInt);
                System.out.println("Кол-во полученных очков за удар = " + ResultsInt);
                if (BestRecord < ResultsInt) {
                    BestRecord = ResultsInt;
                    System.out.println("Внимание, вы установили новый рекорд - " + BestRecord);
                }
                BodyRepeat();
                break;
            case "Results":
                if(Results.size()>10)
                    Results.clear();
                System.out.println("Результаты за последнее время = " + Results);
                Body();
                break;
            default:
                System.out.println("Внимание! Вы ввели неправильное значение!");
                Body();
                break;
        }
       /* if(Randomnum1<=200)  НЕ ИСПОЛЬЗУЕТСЯ (ЭТИ СТРОЧКИ КОДА НУЖНЫ ДЛЯ ТЕКСТА ПОСЛЕ РАНДОМА, К ПРИМЕРУ ВАМ ВЫПАЛО 200 И ВАМ ПИШЕТ
       , ЧТО ВЫ УДАРИЛИ СЛИШКОМ СЛАБО И Т.Д
            System.out.println("");
        else if (Randomnum1>200 && Randomnum1<=400)
            System.out.println("");
        else if (Randomnum1>400 && Randomnum1<=600)
            System.out.println("");
        else if (Randomnum1>600 && Randomnum1<=800)
            System.out.println("");
        else if (Randomnum1>800 && Randomnum1<=1000)
            System.out.println("");
        else {
            System.out.println("Вы ввели неверные данные!");
            Body();
            */
    }
    public static void BodyRepeat(){
        System.out.println("Вы хотите ударить еще 1 раз? (y/n)");
        Vvod=ass.next();
        switch (Vvod){
            case "y":
                ResultsInt=Random();
                Results.add(ResultsInt);
                System.out.println("Кол-во полученных очков за удар ="+ResultsInt);
                System.out.println("Ваш прошлый рекорд = "+BestRecord);
                if(BestRecord<ResultsInt) {
                    BestRecord = ResultsInt;
                    System.out.println("Внимание, вы установили новый рекорд - " + BestRecord);
                }
                BodyRepeat();
                break;
            case "n":
                Body();
                break;
            default:
                System.out.println("Внимание! Вы ввели неправильное значение!");
                BodyRepeat();
                break;
        }
    }
    public static void ResultArrayList(){
        Results.add(ResultsInt);
    }
    public static int Random(){
        Randomnum1=Point+(int) (Math.random()*PointEnd);
        return Randomnum1;
    }
}
