package top.ijiaren.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import top.ijiaren.service.IProblemService;

@Service
public class ProblemService implements IProblemService {

    public int[] twoSum(int[] nums, int target) {
        List<Integer> temp = new ArrayList<Integer>();
        for (int i = 0; i < nums.length - 1; i = i + 2) {
            if (nums[i] + nums[i + 1] == 9) {
                temp.add(i);
                temp.add(i + 1);
            }
        }
        int[] result = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            result[i] = temp.get(i).intValue();
        }
        return result;
    }
}
