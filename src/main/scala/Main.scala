import util.Random
import scala.io.StdIn
import scala.collection.mutable.ListBuffer
object Main extends App {
  // Запрашиваем количество элементов массива
  println("Enter the number of array elements: ")
  val amount = scala.io.StdIn.readInt
  // Запрашиваем максимальный элемент массива
  println("Enter an upper limit for the numbers in the array (from 0 to ...): ")
  val max_value = scala.io.StdIn.readInt
  // Генерируем массив из amount элементов случайными значениями от 0 до max_value
  val list: List[Int] = List.fill(amount)(Random.nextInt(max_value))
  println(list)
  // Выбираем элемент этого массива
  println("Choose the element: ")
  val a: Int = scala.io.StdIn.readInt
  // Создаем буфферный массив
  val list2 = new ListBuffer[Int]()
  // Если в массиве есть запрашиваемый массив, то
  //  для i от 0 до размера первого массива -1
  //    Проверяем а больше i-го элемента первого массива, если да - добавляем его во второй
  // Иначе, выводим сообщение с ошибкой
  if (list.contains(a) == true) {
    for (i <- 0 to list.size-1) {
      if(a > list(i)) {
        list2.append(list(i))
      }
    }
  } else {
    println("Incorrect number!")
  }
  // выводим сумму не дублирующихся элементов массива
  println("Summ = " + list2.distinct.sum)
} 