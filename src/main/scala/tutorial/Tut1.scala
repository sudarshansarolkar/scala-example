package tutorial

/**
 * Created by Sudarshan on 8/8/2015.
 */
class Tut1 {

}
object HelloWorld {
  def main(args: Array[String]) {
    println("Hello, world!")
  }
}


import java.util.{Date, Locale}
import java.text.DateFormat
import java.text.DateFormat._


object UsDate{

  def main(args: Array[String]){
    val dt = new Date
    val fmt = getDateInstance(LONG, Locale.US)

    println(fmt format dt)

  }

}


class Reference[T]{
  private var contents:T = _

  def get:T = contents
  def set(v:T) { contents = v}
}