package com.finbourne.features.unit.dummyfiles.duplicates;

import com.finbourne.features.LusidFeature;

public class DuplicateAnnotationsDummy {

    @LusidFeature("Duplicate Test")
    public void methodOne(){}

    @LusidFeature("Duplicate Test")
    public void methodTwo(){}

    @LusidFeature("control annotation")
    public void methodThree(){}

    public void methodFour() {}
}
