package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

@DisplayName("ShapeCollectorTestSuite")
public class ShapeCollectorTestSuite {

    private static int counter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is start of all tests");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished");
    }

    @BeforeEach
    public void beforeEachTest() {
        counter++;
        System.out.println("Performing test #" + counter);
    }

@Nested
    @DisplayName("Tests for shapes.")
    class ShapeTest {
        @DisplayName("Checks if a circle pulled from the list is the same as the circle that was added to the list.")
        @Test
        public void testGetCircle() {
            //Given
            Circle circle = new Circle(10);
            ShapeCollector collector = new ShapeCollector();
            collector.addFigure(circle);
            //When
            Shape result = collector.getFigure(0);
            //Then
            Assertions.assertEquals(circle, result);
        }

        @DisplayName("Checks if a triangle pulled from the list is the same as the triangle that was added to the list.")
        @Test
        public void testGetTriangle() {
            //Given
            Triangle triangle = new Triangle(10, 10);
            ShapeCollector collector = new ShapeCollector();
            collector.addFigure(triangle);
            //When
            Shape result = collector.getFigure(0);
            //Then
            Assertions.assertEquals(triangle, result);
        }

        @DisplayName("Checks if a square pulled from the list is the same as the square that was added to the list.")
        @Test
        public void testGetSquare() {
            //Given
            Square square = new Square(10);
            ShapeCollector collector = new ShapeCollector();
            collector.addFigure(square);
            //When
            Shape result = collector.getFigure(0);
            //Then
            Assertions.assertEquals(square, result);
        }
    }

@Nested
    @DisplayName("Tests for collector.")
    class CollectorTest {
        @DisplayName("Checks if list size is 1 after adding a figure.")
        @Test
        public void testAddFigure() {
            //Given
            Circle circle = new Circle(10);
            ShapeCollector collector = new ShapeCollector();
            //When
            collector.addFigure(circle);
            //Then
            Assertions.assertEquals(1, collector.getShapeCount());
        }

        @DisplayName("Verifies if a figure has been successfully removed from the list.")
        @Test
        public void testRemoveFigure() {
            //Given
            Circle circle = new Circle(10);
            ShapeCollector collector = new ShapeCollector();
            collector.addFigure(circle);
            //When
            boolean result = collector.removeFigure(circle);
            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, collector.getShapeCount());
        }

        @DisplayName("Checks if a try to remove an non-existent figure from the list returns false.")
        @Test
        public void testRemoveNotExistingFigure() {
            //Given
            Circle circle = new Circle(10);
            ShapeCollector collector = new ShapeCollector();
            //When
            boolean result = collector.removeFigure(circle);
            //Then
            Assertions.assertFalse(result);
        }

        @DisplayName("Checks if figures are shown as expected.")
        @Test
        public void testShowFigures() {
            //Given
            Circle circle = new Circle(10);
            Triangle triangle = new Triangle(10, 10);
            Square square = new Square(10);
            ShapeCollector collector = new ShapeCollector();
            collector.addFigure(circle);
            collector.addFigure(triangle);
            collector.addFigure(square);
            //When
            String retrievedList = collector.showFigures();
            //Then
            Assertions.assertEquals("[circle, triangle, square]", retrievedList);
        }
}
}
