/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("src\\images\\beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  public static void testkeepOnlyBlue()
  {
    Picture beach = new Picture("src\\images\\beach.jpg");
    beach.explore();
    beach.keepOnlyBlue();
    beach.explore();
  }
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("src\\images\\caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("src\\images\\temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("src\\images\\640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("src\\images\\swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  public static void testNegate()
  {
	  Picture beach = new Picture("src\\images\\beach.jpg");
	  beach.explore();
	  beach.negate();
	  beach.explore();
  }
  public static void testGrayscale()
  {
	  Picture beach = new Picture("src\\images\\beach.jpg");
	  beach.explore();
	  beach.grayscale();
	  beach.explore();
  }
  public static void testFixUnderwater()
  {
	  Picture beach = new Picture("src\\images\\water.jpg");
	  beach.explore();
	  beach.fixUnderwater();
	  beach.explore();
  }
 public static void testMirrorVerticalRightToLeft()
 {
	  Picture motor = new Picture("src\\images\\redMotorcycle.jpg");
	  motor.explore();
	  motor.mirrorVerticalRightToLeft();
	  motor.explore();
  }
 public static void testMirrorHorizontal()
 {
	  Picture motor = new Picture("src\\images\\redMotorcycle.jpg");
	  motor.explore();
	  motor.mirrorHorizontal();
	  motor.explore();
  }
 public static void testMirrorHorizontalBotToTop()
 {
	  Picture motor = new Picture("src\\images\\redMotorcycle.jpg");
	  motor.explore();
	  motor.mirrorHorizontalBotToTop();
	  motor.explore();
  }
 public static void testMirrorDiagonal()
 {
	  Picture beach = new Picture("src\\images\\beach.jpg");
	  beach.explore();
	  beach.mirrorDiagonal();
	  beach.explore();
 }
 public static void testMirrorArms() {
	  Picture snow = new Picture("snowman.jpg");
	  snow.explore();
	  snow.mirrorArms();
	  snow.explore();
 }
 public static void testMirrorGull() {
	  Picture snow = new Picture("seagull.jpg");
	  snow.explore();
	  snow.mirrorGull();
	  snow.explore();
 }
 
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    
    //testkeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
	//testMirrorVerticalRightToLeft();
	//testMirrorHorizontal();
	//testMirrorHorizontalBotToTop();
	//testMirrorDiagonal();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    
    //DO NOT GO PAST THIS
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}