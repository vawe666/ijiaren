package top.ijiaren.service;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import top.ijiaren.service.impl.ProblemService;

public class ProblemServiceTest {


    private ProblemService problemService;


    @Test
    public void twoSumTest() {
        int[] origin = new int[]{7, 2, 11, 1};
        int[] target = problemService.twoSum(origin, 9);
        Assert.assertEquals(2,target.length);
    }
}
