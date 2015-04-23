object MyCameraCollection02 {

	class Camera(_brand:String, _model:String, _sensorType:String, _yearBought:Int) {
		val brand:String = _brand
		val model:String = _model
		val yearBought = _yearBought
		val sensorType = _sensorType
		
		override def toString(): String = {
			return "%s %s \t\t %s \t(%d)" format (brand, model, sensorType, yearBought)
		}
	}

	def main(args: Array[String]) {
     	
		val canon5dmarkIII = new Camera("Canon", "5D MkIII", "FF", 2013)
		val canon5dmarkII = new Camera("Canon", "5D MkII", "FF", 2009)
		val canon6d = new Camera("Canon", "6D", "FF", 2014)
		val canon550d = new Camera("Canon", "550D", "APS-C", 2010)
		val canon40d = new Camera("Canon", "40D", "APS-C", 2008)
		val canonIXUS330 = new Camera("Canon", "IXUS 330", "1/2.7", 2001)
		val canonIXUSZ90 = new Camera("Canon", "IXUS Z90", "APS-C", 1999)
		val panasonicGM1 = new Camera("Panasonic", "GM1", "M43", 2014)
		val panasonicFZ20 = new Camera("Panasonic", "FZ20", "1/2.5", 2005)
		val sonyrx100 = new Camera("Sony", "DSC-RX100", "1\"", 2013)
		val sonynex5 = new Camera("Sony", "NEX-5", "APS-C", 2011)
		val sonyr1 = new Camera("Sony", "DSC-R1","APS-C", 2005)

		val myCameras = List(canon5dmarkIII, canon5dmarkII, canon6d, canon550d , canon40d, canonIXUS330, canonIXUSZ90,  panasonicGM1, panasonicFZ20, sonyrx100, sonynex5, sonyr1)
		val canonCameras = myCameras.filter(x => x.brand == "Canon")	// Every Canon camera I ever owned
		val sonyCameras = myCameras.filter(x => x.brand == "Sony")	// Every Sony camera I ever owned
		val pansonicCameras = myCameras.filter(x => x.brand == "Panasonic")	// Every Panasonic camera I ever owned

		println
		println("==Canon camera's owned==")
		canonCameras foreach(cam => println(cam))
		println

		println("==Sony camera's owned==")
		sonyCameras foreach(cam => println(cam))
		println

		println("==Panasonic camera's owned==")
		pansonicCameras foreach(cam => println(cam))
		println
		
		val canonNonFF = myCameras.filter(x => x.brand == "Canon").filter(x=>x.sensorType!="FF")
		println("==Non-FF camera's owned==")
		canonNonFF foreach(cam => println(cam))		
		println

		val apscCameras = myCameras.filter(cam => cam.sensorType=="APS-C")
		println("==APS-C camera's owned==")
		apscCameras foreach(cam => println(cam))
		println

		val apsBefore2012 = apscCameras.filter(cam => cam.yearBought < 2012)
		println("==APS-C camera's bought before 2012 owned==")
		apsBefore2012.foreach(cam => println(cam))
		println

		val ffcamerasBefore2012 = myCameras.filter(cam => cam.yearBought < 2012 && cam.sensorType == "FF")
		println("==Every FF Camera I ever owned before 2012==")
		ffcamerasBefore2012.foreach(cam => println(cam))
		println			
    	}
}

