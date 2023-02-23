package com.ll.level0.p120829;

public class Tests {
    @Test
    @DisplayName("70도가 입력되었을 때의 결과는 1")
    void t1(){
        assetThat(new Solution().solution(70)isEqualTo(1));
    }
}
