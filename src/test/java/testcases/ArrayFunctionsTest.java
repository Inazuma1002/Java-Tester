package testcases;

import org.example.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Unit test for Array Functions Library.
 */
public class ArrayFunctionsTest 
{	
	ArrayFunctions obj = new ArrayFunctions();
	
    @Test
    public void TestbubbleSort()
    {
		ArrayFunctions obj = new ArrayFunctions();
		int[] Array1 = { 12, 1234, 45, 67, 1 };int[] Array2 = { 68666, 95646, 58864, 65730, 85867, 43955, 92396, 39843, 81476, 68421, 91097, 48249, 21582, 95025, 92012, 14766, 88106};
    	int[] Sorted_Array2 = { 14766, 21582, 39843, 43955, 48249, 58864, 65730, 68421, 68666, 81476, 85867, 88106, 91097, 92012, 92396, 95025, 95646};
    	assertArrayEquals(new int[]{1,12, 45, 67, 1234}, obj.bubbleSort(Array1));
		assertArrayEquals(Sorted_Array2, obj.bubbleSort(Array2));
    }
    
    @Test
    public void TestinsertionSort()
    {
		ArrayFunctions obj = new ArrayFunctions();
    	int[] Array1 = {4011, 3155, 4400, 2099, 3824, 5234, 5722, 5539, 1457, 28021};
    	int[] Sorted1 = {1457, 2099, 3155, 3824, 4011, 4400, 5234, 5539, 5722,28021};
    	int[] Array2 = { 80529, 53256, 49711, 2788, 91910, 67304};
    	int[] Sorted2 = {2788, 49711, 53256, 67304, 80529,91910};

		assertArrayEquals(Sorted1, obj.insertionSort(Array1));

    	assertArrayEquals(Sorted2, obj.insertionSort(Array2));

	}

    @Test
    public void TestheapSort()
    {
		ArrayFunctions obj = new ArrayFunctions();
		int[] Array1 = {10, 23, 34, 45, 56}; int[] Array = { 80189, 67781, 15287, 3289, 6356, 68572, 18761, 61895, 70030, 56783, 112, 570, 30523, 26157, 65536, 85755, 18116, 34135, 66734, 87900, 65330, 31322, 88501, 18626, 15713, 50346, 82895, 67565, 90417, 19111, 39452, 70606, 86892, 54739, 73895};
    	int[] Sorted_Array = { 112, 570, 3289, 6356, 15287, 15713, 18116, 18626, 18761, 19111, 26157, 30523, 31322, 34135, 39452, 50346, 54739, 56783, 61895, 65330, 65536, 66734, 67565, 67781, 68572, 70030, 70606, 73895, 80189, 82895, 85755, 86892, 87900, 88501, 90417};

    	assertArrayEquals(Sorted_Array, obj.heapSort(Array));
    	assertArrayEquals(new int[]{10,23, 34, 45, 56}, obj.heapSort(Array1));
    }

    @Test
    public void TestmergeSort()
    {
		ArrayFunctions obj = new ArrayFunctions();
    	int[] Array = { 12, 1234, 45, 67, 1 };int[] Array1 = {15, 26, 37, 48, 59};
    	int[] Array2 = {  1876, 2471, 3601, 9173, 6278, 3671, 6154, 5173};
    	int[] Sorted_Array2 = {1876, 2471, 3601, 3671, 5173, 6154, 6278, 9173};
    	assertArrayEquals(new int[]{1,12, 45, 67, 1234}, obj.mergeSort(Array));
    	assertArrayEquals(new int[]{15,26, 37, 48, 59}, obj.mergeSort(Array1));
    	assertArrayEquals(Sorted_Array2, obj.mergeSort(Array2));
    }

    @Test
    public void TestselectionSort()
    {
		ArrayFunctions obj = new ArrayFunctions();
    	int[] Array = { 56837, 5541, 3430, 77465, 79231, 3651, 53958, 32934, 42961, 2070, 41373, 56316, 94870, 87309, 25490, 71751, 39992, 65022, 70699};
    	int[] Array1 = { 2070, 3430, 3651, 5541, 25490, 32934, 39992, 41373, 42961, 53958, 56316, 56837, 65022, 70699, 71751, 77465, 79231, 87309, 94870};
    	assertArrayEquals(Array1, obj.selectionSort(Array));
    }

    @Test
    public void TestquickSort()
    {
		ArrayFunctions obj = new ArrayFunctions();
    	int[] Array = { 2457, 13811, 41766, 21226, 38528, 77782, 12966, 1316, 14494, 74515, 53055, 52374};
    	int[] Array1 = { 1316, 2457, 12966, 13811, 14494, 21226, 38528, 41766, 52374, 53055, 74515, 77782};
    	assertArrayEquals(Array1, obj.quickSort(Array));
    }

    @Test
    public void TestcountSort()
    {
		ArrayFunctions obj = new ArrayFunctions();
    	int[] Array = { 92342, 82569  , 23459, 55458, 57925, 46547, 45638, 99640, 22080, 72349, 30410, 99222, 57697, 87761, 74780, 62890, 3542, 74780, 83323};
    	int[] Array1 = { 3542, 22080, 23459, 30410, 45638, 46547, 55458, 57697, 57925, 62890 , 72349, 74780, 74780, 82569, 83323, 87761, 92342, 99222, 99640
		};
    	assertArrayEquals(Array1,obj.countSort(Array));
    }

    @Test
    public void TestoddEvenSort()
    {
		ArrayFunctions obj = new ArrayFunctions();
    	int[] Array = { 87827, 34425, 81490, 65914, 3632, 25746, 77825, 62596, 83610, 30815, 22100, 19802, 61244, 10973, 67460, 78226, 71946};
    	int[] Array1 = { 3632, 10973, 19802, 22100, 25746, 30815, 34425, 61244, 62596, 65914, 67460, 71946, 77825, 78226, 81490, 83610, 87827};
    	assertArrayEquals(Array1, obj.oddEvenSort(Array));
    }

    @Test
    public void TestbucketSort()
    {
		ArrayFunctions obj = new ArrayFunctions();
    	int[] Array = { 30540, 73740, 26044, 64965, 55231, 91959, 68598, 80978, 69784, 31195, 64588, 600, 53295, 84390, 61844, 64269, 51851, 40070, 36215};
    	int[] Array1 = { 600, 26044, 30540, 31195, 36215, 40070, 51851, 53295, 55231, 61844, 64269, 64588, 64965, 68598, 69784, 73740, 80978, 84390, 91959};
    	int[] Array2 = { 39438, 78309, 79844, 91164, 19755, 33522, 76822, 27777, 55396, 47739, 62887, 36478, 51340, 95222, 91619, 63571, 71729, 14160, 60696, 1630, 24288, 13723, 80417, 15667, 40094, 12979, 10880, 99892, 21825, 51293, 83911, 61263, 29603, 63755, 52428, 49358, 97277, 29251, 77135, 52674, 76991, 40022};
    	int[] sorted_Array2 = { 1630, 10880, 12979, 13723, 14160, 15667, 19755, 21825, 24288, 27777, 29251, 29603, 33522, 36478, 39438, 40022, 40094, 47739, 49358, 51293, 51340, 52428, 52674, 55396, 60696, 61263, 62887, 63571, 63755, 71729, 76822, 76991, 77135, 78309, 79844, 80417, 83911, 91164, 91619, 95222, 97277, 99892};
    	assertArrayEquals(Array1, obj.bucketSort(Array));
    	assertArrayEquals(sorted_Array2, obj.combSort(Array2));
    }

    @Test
    public void TestcombSort()
    {
		ArrayFunctions obj = new ArrayFunctions();
    	int[] Array = { 66179, 69978, 32761, 88934, 64671, 34148, 5016, 76670, 80333, 69871};
    	int[] Array1 = { 5016, 32761, 34148, 64671, 66179, 69871, 69978, 76670, 80333, 88934};
    	int[] Array2 = { 39438, 78309, 79844, 91164, 19755, 33522, 76822, 27777, 55396, 47739, 62887, 36478, 51340, 95222, 91619, 63571, 71729, 14160, 60696, 1630, 24288, 13723, 80417, 15667, 40094, 12979, 10880, 99892, 21825, 51293, 83911, 61263, 29603, 63755, 52428, 49358, 97277, 29251, 77135, 52674, 76991, 40022};
    	int[] sorted_Array2 = { 1630, 10880, 12979, 13723, 14160, 15667, 19755, 21825, 24288, 27777, 29251, 29603, 33522, 36478, 39438, 40022, 40094, 47739, 49358, 51293, 51340, 52428, 52674, 55396, 60696, 61263, 62887, 63571, 63755, 71729, 76822, 76991, 77135, 78309, 79844, 80417, 83911, 91164, 91619, 95222, 97277, 99892};
    	assertArrayEquals(Array1, obj.combSort(Array));
    	assertArrayEquals(sorted_Array2, obj.combSort(Array2));
    }

    @Test
    public void TestgetMin()
    {
		ArrayFunctions obj = new ArrayFunctions();
    	int[] Array = { 12, 1234, 45, 67, 1 };
    	int[] Array1 = {1, 2, 3, 4, 5};
    	assertEquals(1, obj.getMin(Array));
    	assertEquals(1, obj.getMin(Array1));
    }

    @Test
    public void TestgetMax()
    {
		ArrayFunctions obj = new ArrayFunctions();
    	int[] Array = {12, 1234, 451, 672, 13, 204};int[] Array1 = {14, 25, 36, 42, 51};
    	assertEquals(1234, obj.getMax(Array));
    	assertEquals(51, obj.getMax(Array1));
    }

    @Test
    public void Testsearch()
    {
		ArrayFunctions obj = new ArrayFunctions();
    	int[] Array = { 12, 123, 42, 26, 12 };
    	int[] Array1 = {12, 22, 33, 43, 52};
    	assertEquals(1, obj.search(Array,123));
    	assertEquals(-1, obj.search(Array1,1234));
    }

    @Test
    public void Testsum()
    {
		ArrayFunctions obj = new ArrayFunctions();
    	int[] Array = { 120, 12340, 450, 670, 15 };int[] Array1 = {10, 20, 30, 40, 50};
    	assertEquals(13595, obj.sum(Array));
    	assertEquals(150, obj.sum(Array1));
    }

    @Test
    public void TestbinarySearch()
    {
		ArrayFunctions obj = new ArrayFunctions();
    	int[] Array = { 12, 45, 67};int[] Array2 = { 14766, 21582, 39843, 43955, 48249, 58864, 65730, 68421, 68666, 81476, 85867, 88106, 91097, 92012, 92396, 95025, 95646};
    	assertEquals(0, obj.binarySearch(Array,12));
    	assertEquals(-1, obj.binarySearch(Array,42));
    	assertEquals(5, obj.binarySearch(Array2,58864));
    	assertEquals(16, obj.binarySearch(Array2,95646));
    }

    @Test
    public void TestleftRotatebyOne()
    {
		ArrayFunctions obj = new ArrayFunctions();
    	int[] Array = {16,178,22, 45,4,7,80,9};
    	assertArrayEquals(new int[] {178,22, 45,4,7,80,9,16}, obj.leftRotatebyOne(Array));
    }

  @Test
  public void TestreverseArray()
  {
	  ArrayFunctions obj = new ArrayFunctions();
  	int[] Array = { 12, 1234, 45, 67, 1 };
  	int[] Array1 = {1, 2, 3, 4, 5};
  	assertArrayEquals(new int[]{1,67, 45, 1234, 12}, obj.reverseArray(Array));
  	assertArrayEquals(new int[]{5, 4, 3, 2, 1}, obj.reverseArray(Array1));
  }

  @Test
  public void Testgcd()
  {
	  ArrayFunctions obj = new ArrayFunctions();
  	int Number1 = 20;int Number2 = 28;int Number3 = 98; int Number4 = 56;
  	assertEquals(4, obj.gcd(Number1,Number2));
	  assertEquals(14, obj.gcd(Number3,Number4));
  }

	@Test
	public void TestleftRotatebyK()
	{
		ArrayFunctions obj = new ArrayFunctions();int[] Array = {1,2,3,4,5,6,7};
		assertArrayEquals(new int[] {3,4,5,6,7,1,2}, obj.leftRotatebyK(Array,2));
	}

  @Test
  public void TestcountOccurrences()
  {
	  ArrayFunctions obj = new ArrayFunctions();
  	int Array[] = { 12, 13, 12, 13, 50, 10, 50 };
  	assertEquals(2, obj.countOccurrences(Array, 12));
  	assertEquals(2, obj.countOccurrences(Array, 50));
  }

  @Test
  public void TestchkPair()
  {
	  ArrayFunctions obj = new ArrayFunctions();
	  int Array[] = {0, -1, 2, -3, 1};
	  assertEquals(true, obj.chkPair(Array, -2));
	  assertEquals(false, obj.chkPair(Array, 5));
  }

   @Test
   public void TestfindMean()
   {
	   ArrayFunctions obj = new ArrayFunctions();
  	 int[] Array = { 12, 32, 42, 22, 72, 52, 82, 62 };
  	 assertEquals(47, obj.findMean(Array), 0.01);
   }

   @Test
   public void TestfindMedian()
   {
	   ArrayFunctions obj = new ArrayFunctions();
  	 int Array[] = { 1, 3, 4, 2, 7, 5, 8, 6 };
  	 int Array2[] = {89,12,65};
  	 assertEquals(4.5, obj.findMedian(Array), 0.01);
  	assertEquals(65.0, obj.findMedian(Array2), 0.01);
   }

   @Test
   public void TestsumArrays()
   {
	   ArrayFunctions obj = new ArrayFunctions();
	  int[] Array = {10, 20, 30, 40, 50};
	  int[] Array1 = {50, 40, 30, 20, 10};
	  assertArrayEquals(new int[]{60,60,60,60,60}, obj.sumArrays(Array,Array1));
   }

	@Test
	public void TestdiffArrays()
	{
		ArrayFunctions obj = new ArrayFunctions();
		int[] Array = { 7, 8, 10, 14, 15 };int[] Array1 = {1, 2, 3, 4, 5};
		assertArrayEquals(new int[]{6,6,7, 10, 10}, obj.diffArrays(Array,Array1));
	}

	@Test
	public void TestmulArrays()
	{
		ArrayFunctions obj = new ArrayFunctions();
		int Array[] = {1, 2, 3, 4, 5};
		  int Array1[] = {1, 2, 3, 4, 5};
		  assertArrayEquals(new int[]{1,4, 9, 16, 25}, obj.mulArrays(Array,Array1));
	}

	@Test
	public void TestconcatArrays()
	{
		ArrayFunctions obj = new ArrayFunctions();
		  int Array[] = { 1, 2};
		  int Array1[] = {3};
		  int Array2[] = {3,4};
		  assertArrayEquals(new int[]{1,2,3}, obj.concatArrays(Array,Array1));
		  assertArrayEquals(new int[]{1,2,3,4}, obj.concatArrays(Array,Array2));
	}

	@Test
	public void TestfindMaxCount()
	{
		ArrayFunctions obj = new ArrayFunctions();
		int Array[] = {1, 5, 2, 1, 3, 2, 1};
		int Array1[] = {2,3,3,3};
		assertEquals(1, obj.findMaxCount(Array));
		assertEquals(3, obj.findMaxCount(Array1));
	}

	@Test
	public void TestfindMinCount()
	{
		ArrayFunctions obj = new ArrayFunctions();
		int Array[] = {1, 5, 2, 5, 3, 2, 1};
		int Array2[] = {1,2,11,0};
		assertEquals(3, obj.findMinCount(Array));
		assertEquals(11, obj.findMinCount(Array2));
	}

	@Test
	public void TestfindKthlargest()
	{
		ArrayFunctions obj = new ArrayFunctions();
		int Array[] = {7, 10, 4, 3, 20, 15};
		assertEquals(10, obj.findKthlargest(Array,3));
	}

	@Test
	public void TestfindKthsmallest()
	{
		ArrayFunctions obj = new ArrayFunctions();
		int Array[] = {7, 10, 4, 3, 20, 15};
		assertEquals(7, obj.findKthsmallest(Array,3));
	}

	@Test
	public void TestgetUnion()
	{
		ArrayFunctions obj = new ArrayFunctions();
		  int Array[] = { 1, 2, 5, 6, 7, 3 };
		  int Array1[] = { 2, 4, 5, 6, 8, 9};
		  assertArrayEquals(new int[]{1,2,3,4,5,6,7,8,9}, obj.getUnion(Array,Array1));
	}

	@Test
	public void TestgetIntersection()
	{
		ArrayFunctions obj = new ArrayFunctions();
		  int Array[] = { 1, 2, 5, 6, 7, 3 };
		  int Array1[] = { 2, 4, 5, 6, 8, 9};
		  int Array2[] = {1,2,3};
		  int Array3[] = {1,3};
		  int Array4[] = {4,6};
		  int Array5[] = {2,4,6};
		  assertArrayEquals(new int[]{2,5,6}, obj.getIntersection(Array,Array1));
		  assertArrayEquals(Array3, obj.getIntersection(Array2,Array3));
		  assertArrayEquals(Array4, obj.getIntersection(Array4,Array5));
	}

}
