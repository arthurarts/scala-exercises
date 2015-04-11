
object CameraCollection {
/*
	object SensorType extends Enumeration {
 	   type SensorType = Value
    		val FullFrame,APSC = Value
	}
*/	
	case class Camera(brand:String, model:String, sensorType:String, price:BigDecimal)

	def main(args: Array[String]) = {
	
		val canon6d=Camera("Canon", "EOS 6D", "FullFrame", 1450)
	 	val canon5dm3=Camera("Canon", "EOS 5D Mark III","FullFrame", 2300.00)
		val canon5dm2=Camera("Canon", "EOS 5D Mark II", "FullFrame" , 1780)
		val canon550d=Camera("Canon", "EOS 550D", "APSC", 560)
		val canon40d=Camera("Canon", "EOS40D", "APSC", 1079)

		val myCameras = List(canon6d, canon5dm3, canon5dm2, canon550d,canon40d)
	        println( "\n======APSC Camera's======")	
		myCameras filter (x => x.sensorType == "APSC") foreach(println)
		println( "\n======FullFrame Camera's======" )
                myCameras filter (x => x.sensorType == "FullFrame") foreach(println)
		println

	}
}
