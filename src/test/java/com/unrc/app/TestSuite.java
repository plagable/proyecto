package com.unrc.app;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({InmoTest.class, UserSpec.class, OwnerSpec.class, AdSpec.class, BuildingSpec.class, OwnerBuildingSpec.class})
public class TestSuite {
}