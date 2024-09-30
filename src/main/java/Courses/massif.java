package Courses;

import java.util.Arrays;

public class massif {

    public static void main(String[] args) {
        //int [] arr = {1, 22, 33, 23, 45, 66, 7}; //Поделить все числа на 10
        //int [] arr={1,2,3,4,5,6,7,8,9,1}; //Добавить элемент в конец
        //arr = addLast(arr,99); //Добавить элемент в конец
        //System.out.println(Arrays.toString(arr)); //Добавить элемент в конец
        int [] arr={1,2,3,4,5}; //Добавить в конец такие элементы второго массива, которых нет в первом
        int [] arr2={9,1,2,5,7,4}; //Добавить в конец такие элементы второго массива, которых нет в первом
        arr=addUniq(arr,arr2); //Добавить в конец такие элементы второго массива, которых нет в первом
        System.out.println(Arrays.toString(arr)); //Добавить в конец такие элементы второго массива, которых нет в первом
        String [] arrS = {"DDsdfgds","ADFFsddsa","FDDDqwefg","qwefg","werghferf","werfefefdef"};
        //div10(arr); //Поделить все числа на 10 (Исполняются числа из int)
        //print(arr); //Поделить все числа на 10 (Выводит результат деления на числа из int)
        //String [] arr2 = {"DDsdfgds","ADFFsddsa","FDDDqwefg","qwefg","werghferf","werfefefdef"}; //Если слово начинается с большой буквы, то привести все слово в верхний регистр
        //System.out.println(concat(arr2)+"!"); //Объеденить все слова, составив их через пробел.
        //upWords(arr2); //Если слово начинается с большой буквы, то привести все слово в верхний регистр
        //System.out.println(Arrays.toString(arr2)); //Если слово начинается с большой буквы, то привести все слово в верхний регистр
        //int [] arr = {1, 2, 3, 4, 5, 6, 7}; //Содержит ли числовой массив определенное число
        //String [] arr={"sdfgds","Asddsa","qwefg","qwefg","P"}; //Найти последнее слово массива, начинающееся с буквы А
        //System.out.println(contains(arr, 8) + "\n"); //Содержит ли числовой массив определенное число
        //System.out.println(contains(arr, 5)); //Содержит ли числовой массив определенное число
        //System.out.println(findLastAWorld(arr)); //Найти последнее слово массива, начинающееся с буквы А
    }
    //Содержит ли числовой массив определенное число
    public static boolean contains(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "]=" + arr[i]);
            if (arr[i] == x) return true;
        }
        return false;
    }

    //Найти последнее слово массива, начинающееся с буквы А
    public static String findLastAWorld(String[]arr) {
        for(int i = arr.length-1; i>=0; i--) {
            System.out.println("arr["+i+"]="+arr[i]);
            if(arr[i].charAt(0)=='A') return arr[i];
        }
        return null;
    }

    ////ПРИНТ ДЛЯ того, что бы поделить все числа на 10
    public static void print(int[]arr) { //ПРИНТ ДЛЯ того, что бы поделить все числа на 10
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }

    }

    //Поделить все числа на 10
    public static void div10(int[]arr) {
        for(int i=0; i<arr.length;i++) {
            arr[i]/=10;
        }
    }

    //Если слово начинается с большой буквы, то привести все слово в верхний регистр
    public static void upWords(String[]arr) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i].charAt(0)>='A'&&arr[i].charAt(0)<='Z')
                arr[i]=arr[i].toUpperCase();
        }

    }

    //Объединить все слова, составив их через пробел
    public static String concat(String[]arr) {
        String res = "";
        for(int i=0;i<arr.length-1;i++){
            res+=arr[i]+" ";
        }
        res+=arr[arr.length-1]; //Эта итерация нужна, что бы убрать пробел в конце последнего слова!
        return res;

    }

    //Добавить элемент в конец
    public static int[] addLast(int[]arr, int x) {
        int[]res=new int[arr.length+1];
        for(int i=0;i<arr.length;i++){
            res[i]=arr[i];
        }
        res[arr.length]=x;
        return res;
    }

    //Добавить в конец такие элементы второго массива, которых нет в первом
    public static int[] addUniq(int[]arr, int[]arr2) {
        //Заводим временный массив, по размеру, как оба вместе
        int[]tmp=new int[arr.length+arr2.length];
        //элементы первого массива копируем без изменений
        for(int i=0;i<arr.length;i++) {
            tmp[i]=arr[i];
        }
        System.out.println(Arrays.toString(tmp));
        //элементы второго копируем, только если их нет в массиве arr
        //заметьте, что j двигается не каждую итерацию, а только, когда нужно
        int j = arr.length;
        for(int i=0;i<arr2.length;i++){
            if(!contains(arr, arr2[i]))
                tmp[j++]=arr2[i];
        }
        System.out.println(Arrays.toString(tmp));
        //Делаем новый массив правильного размера и копируем туда значения
        int[]res=new int[j];
        for(int i=0;i<j;i++){
            res[i]=tmp[i];
        }
        return res;
    }

}

