package hexlet.code.controllers.games.gcd;

//поиск НОД от 2х чисел
public class SearchGCD {
    //массив для разложения на делители одного числа
    private static int[] finalArr;

    //метод поиска длинны массива из числа для разложения
    //на делители для finalArr
    private static int searchIndexArr(int varT) {
        int divisor = 2;
        int index = 1;
        while (varT != divisor) {
            if ((varT % divisor) == 0) {
                varT = varT / divisor;
                index++;
            } else {
                divisor++;
            }
        }
        return  index;
    }

    //заполнение массива finalArr делителями числа
    private static int[] searchFinalArr(int varT) {
        finalArr = new int[searchIndexArr(varT)];
        int divisor = 2;
        int index = 0;
        while (varT != divisor) {
            if ((varT % divisor) == 0) {
                varT = varT / divisor;
                finalArr[index] = divisor;
                index++;
            } else {
                divisor++;
            }
        }
        finalArr[finalArr.length - 1] = divisor;
        return  finalArr;
    }

    //поиск совпадений 2х массивов
    //первый массив меньше по умолчанию
    private static int matchingArr(int[] arrA, int[] arrB) {
        //сравниваем числа меньшего массива с большим, тк числа отсортированы
        //то шаг по большему массиву через jG оправдан
        int gcd = 1;
        int jG = 0;
        for (int i = 0; i < arrA.length; i++) {
            for (int j = jG; j < arrB.length; j++) {
                if (arrA[i] == arrB[j]) {
                    gcd = gcd * arrA[i];
                    jG = j + 1;
                    break;
                }
            }
        }
        return gcd;
    }

    //поиск общих делителей 2х массивов
    private static int searchForSharedArr(int[] arrA, int[] arrB) {
        //что бы не заморачиваться с поиском длинны массива состоящего из совпадений
        //мы знаем, что он не может быть больше минимального из 2х массивов
        if (arrA.length > arrB.length) {
            return matchingArr(arrB, arrA);
        } else {
            return matchingArr(arrA, arrB);
        }

    }

    public static int searchGCD(int varA, int varB) {
        //заполняем массивы делителями от обоих переменных
        int[] finalArrVarA = searchFinalArr(varA);
        int[] finalArrVarB = searchFinalArr(varB);
        // сравниваем массивы и находим НОД
        return searchForSharedArr(finalArrVarA, finalArrVarB);
    }
}
