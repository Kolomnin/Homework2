import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

/*      ### **Задача 1.**
На уроке мы проходили разные типы переменных.
Объявите переменные всех типов, что мы изучили на уроке, и присвойте им любые значения (инициализируйте их).
    – Перечислены все типы переменных
    – Значения к типам переменных присвоены корректно
    – Все переменные инициализированы корректно (включая спецсимволы после значений для long и float)
*/

        byte a = 5;
        int b = 3;
        short c = 6;
        long d = 7L;
        double i = 1.1;
        float f = 1.2f;
        char g = 165;
        boolean isTrue = (a > b != b > c);

        System.out.println(g);
        System.out.println(isTrue);
        System.out.println();


    /* ### **Задача 2.**

    А теперь решите задание.
    В боксе, перед каждым боем, спортсменов взвешивают – это делают для того, чтобы убедиться,
    что боксеры соответствуют своей весовой категории, и бой будет честным.

    Вес одного боксера – 78,2 кг
    Вес второго боксера – 82,7 кг
    Подсчитайте и выведите в консоль общий вес двух бойцов.
    Подсчитайте и выведите в консоль разницу между весами бойцов.

- **Критерии оценки**
    – Тип переменной присвоен верно
    – Выполнены все условия и операции задания
    – Все переменные инициализированы
     */

        double weightFighterOne = 78.2;
        double weightFighterTwo = 82.7;
//        double weightAll = weightFighterOne + weightFighterTwo;
//        double weightDifference = weightFighterTwo - weightFighterOne;

        System.out.println("Общий вес боксеров: " + (weightFighterOne + weightFighterTwo) + " кг");
        System.out.println("Разница между весами бойцов: " + (weightFighterTwo - weightFighterOne) + " кг");
        System.out.println();

        /* ### **Задача 3.**

        За весом спортсмена следит не только сам спортсмен, но и его тренер.
        Он достигается и поддерживается упорными тренировками и сбалансированным питанием.
        Вот один из рецептов завтрака перед тренировкой, который получил наш спортсмен для поддержания формы:

          – Бананы – 5 штук (1 банан - 80 грамм);
          – Молоко – 200 мл (100 мл = 105 грамм);
          – Мороженое пломбир – 2 брикета по 100 грамм;
          – Яйца сырые – 4 яйца (1 яйцо - 70 грамм).

                Смешать всё в блендере и готово.
                Подсчитайте вес (количество грамм) такого спорт-завтрака, а затем переведите его в килограммы.
                Результат напечатайте в консоль.

                **Важное условие:** если в рецепт нужно добавить несколько единиц какого-то продукта (с определенным весом),
                то нужно умножать количество единиц на вес в граммах. Например, если в рецепте указано,
                что нужно добавить 5 бананов по 80 грамм, то нужно количество (5 бананов) умножить на вес одного (80 грамм),
                а не считать самому общую сумму грамм.
                - **Критерии оценки**
    **–** Все переменные присвоены

    – Операция подсчета общего веса завтрака в граммах выполнена верно
    – Операция перевода из грамм в килограммы проведена верно
    – Все условия задания выполнены*/

        int weightBanana = 80*5;
        int weightMilk = 105*2;
        int weightAceCream = 100*2;
        int weightEgg = 70*4;
        int weightAll = weightBanana + weightMilk + weightAceCream + weightEgg;
        double weightInKg = 1.0*weightAll/1000;

        System.out.println("Обищй вес : " + weightAll + " грамм");
        System.out.println("Обищй вес : " + weightInKg + " кг");
        System.out.println();

       /* ### **Задача 4.**

        Правила соревнований обновились, и теперь нашему спортсмену нужно сбросить 7 кг, чтобы оставаться в своей весовой категории.

                Тренер скорректировал рацион так, чтобы спортсмен мог терять в весе от 250 до 500 грамм в день.
                Посчитайте, сколько дней уйдёт на похудение, если спортсмен будет терять каждый день по 250 грамм и сколько,
                если каждый день будет худеть на 500 грамм.
                Посчитайте, сколько может потребоваться дней в среднем, чтобы добиться результата похудения.
                Результаты подсчетов выведите в консоль.

        - **Критерии оценки**

    **–** Все переменные присвоены верно
    – Операция деления выполнена верно
    – Операция определения остатка деления выполнена верно
    – Результат подсчетов выведен в консоль
    – Все условия задания выполнены*/

        int weightLoss250 = 7000/250;
        int weightLoss500 = 7000/500;
        int averageDays = (weightLoss250 + weightLoss500)/2;

        System.out.println("Спортсмен теряет в весе на 7 кг по 250 грамм за: " + weightLoss250 + " дней");
        System.out.println("Спортсмен теряет в весе на 7 кг по 500 грамм за: " + weightLoss500 + " дней");
        System.out.println("В среднем на похудение может понадобиться дней: " + averageDays);
        System.out.println();

        /*### **Задача 5.**

        Отойдем от спорта и представим, что мы работаем в большой компании, штат которой состоит из нескольких сотен сотрудников.
        В компании есть правило, что чем дольше сотрудник работает в компании, тем ценнее он для бизнеса. Поэтому сотрудники,
        которые работают в компании дольше 3 лет, получают повышение зарплаты раз в год. Каждый год повышение составляет 10% от текущей зарплаты.
        К вам пришел руководитель с задачей автоматизировать повышение зарплаты, а также провести расчет для следующих сотрудников:

        Маша получает 67 760 рублей в месяц
        Денис получает 83 690 рублей в месяц
        Кристина получает 76 230 рублей в месяц

        Каждому нужно увеличить зарплату на 10% от текущей месячной.
        Дополнительно руководитель попросил посчитать разницу между годовым доходом с нынешней зарплатой и после повышения.
        Посчитайте, сколько будет получать каждый из сотрудников, а также разницу между годовым доходом до и после повышения.

                Выведите в консоль информацию по каждому сотруднику.

        Например, “Маша теперь получает **** рублей. Годовой доход вырос на **** рублей”.

        - **Критерии оценки**

    **–** Все переменные присвоены верно
    – Операция умножения выполнена верно
    – Операция сложения выполнена верно
    – Все условия задания выполнены*/

        HashMap<String, Integer> employees = new HashMap<>();
        // ежемесечная ЗП до повышения
        int mashaCash = 67760;
        int denisCash = 83690;
        int kristinaCash = 76230;

        // ежемесячная ЗП после повышения на 10%
        int highMashaCash = mashaCash + (mashaCash/10);
        int highDenisCash = denisCash + (denisCash/10);
        int highKristinaCash = kristinaCash + (kristinaCash/10);

        // годовая ЗП после повышения
        int mashaYearCash = (highMashaCash - mashaCash)*12;
        int denisYearCash = (highDenisCash - denisCash)*12;
        int kristinaYearCash = (highKristinaCash - kristinaCash)*12;


        System.out.println("Маша теперь получает " + highMashaCash + " рублей. Годовой доход вырос на " + mashaYearCash + " рублей.");
        System.out.println("Денис теперь получает " + highDenisCash + " рублей. Годовой доход вырос на " + denisYearCash + " рублей.");
        System.out.println("Кристина теперь получает " + highKristinaCash + " рублей. Годовой доход вырос на " + kristinaYearCash + " рублей.");

    }
}