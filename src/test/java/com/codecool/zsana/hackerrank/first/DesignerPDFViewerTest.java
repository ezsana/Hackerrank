package com.codecool.zsana.hackerrank.first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DesignerPDFViewerTest {

    private int[] letterHeights = {1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
                                 //a  b  c  d  e  f  g  h  i  j  k  l  m  n  o  p  q  r  s  t  u  v  w  x  y  z
    @Test
    void emptyString() {
        Assertions.assertEquals(0, DesignerPDFViewer.designerPdfViewer(letterHeights, ""));
    }

    @Test
    void uppercaseLetters() {
        Assertions.assertEquals(8, DesignerPDFViewer.designerPdfViewer(letterHeights, "IF"));
    }

    @Test
    void getAreaWithMoreLetters() {
        Assertions.assertEquals(8, DesignerPDFViewer.designerPdfViewer(letterHeights, "if"));
        Assertions.assertEquals(15, DesignerPDFViewer.designerPdfViewer(letterHeights, "wow"));
        Assertions.assertEquals(12, DesignerPDFViewer.designerPdfViewer(letterHeights, "abcd"));
    }

}