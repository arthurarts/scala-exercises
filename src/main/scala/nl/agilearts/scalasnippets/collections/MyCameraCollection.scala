package nl.agilearts.scalasnippets.collections


object MyCameraCollection {

  case class Camera(brand:String, model:String, sensorType:String, price:BigDecimal)

  def main(args: Array[String]) = {

    val canon6d=Camera("Canon", "EOS 6D", "Full Frame", 1450)
    val canon5dm3=Camera("Canon", "EOS 5D Mark III","Full Frame", 2300.00)
    val canon5dm2=Camera("Canon", "EOS 5D Mark II", "Full Frame" , 1780)
    val canon550d=Camera("Canon", "EOS 550D", "APS-C", 560)
    val canon40d=Camera("Canon", "EOS 40D", "APS-C", 1079)

    val myCameras = List(canon6d, canon5dm3, canon5dm2, canon550d,canon40d)

    println( "\nAPS-C:")
    myCameras filter (x => x.sensorType == "APS-C") foreach(println)
    println( "\nFull Frame:" )
    myCameras filter (x => x.sensorType == "Full Frame") foreach(println)
    println
  }
}


