package fr.lernejo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {

    @Test
    void op_basic_add() {
        Sample sample = new Sample();
        int a = 1;
        int b = 1;
        long res = sample.op(Sample.Operation.ADD, a, b);
        Assertions.assertEquals(res, 2);
    }

    @Test
    void op_basic_mult() {
        Sample sample = new Sample();
        int a = 1;
        int b = 1;
        long res = sample.op(Sample.Operation.MULT, a, b);
        Assertions.assertEquals(res, 1);
    }

    @Test
    void op_pos_add_pos() {
        Sample sample = new Sample();
        int a = 6;
        int b = 20;
        long res = sample.op(Sample.Operation.ADD, a, b);
        Assertions.assertEquals(res, 26);
    }

    @Test
    void op_pos_mult_pos() {
        Sample sample = new Sample();
        int a = 6;
        int b = 9;
        long res = sample.op(Sample.Operation.MULT, a, b);
        Assertions.assertEquals(res, 54);
    }

    @Test
    void op_pos_add_neg() {
        Sample sample = new Sample();
        int a = -6;
        int b = 20;
        long res = sample.op(Sample.Operation.ADD, a, b);
        Assertions.assertEquals(res, 14);
    }

    @Test
    void op_pos_mult_neg() {
        Sample sample = new Sample();
        int a = -6;
        int b = 9;
        long res = sample.op(Sample.Operation.MULT, a, b);
        Assertions.assertEquals(res, -54);
    }

    @Test
    void op_neg_add_neg() {
        Sample sample = new Sample();
        int a = -6;
        int b = -20;
        long res = sample.op(Sample.Operation.ADD, a, b);
        Assertions.assertEquals(res, -26);
    }

    @Test
    void op_neg_mult_neg() {
        Sample sample = new Sample();
        int a = -6;
        int b = -11;
        long res = sample.op(Sample.Operation.MULT, a, b);
        Assertions.assertEquals(res, 66);
    }

    @Test
    void op_big_add_pos() {
        Sample sample = new Sample();
        int a = 4266846;
        int b = 24686432;
        long res = sample.op(Sample.Operation.ADD, a, b);
        Assertions.assertEquals(res, 28953278);
    }

    @Test
    void op_big_mult_pos() {
        Sample sample = new Sample();
        int a = 12345;
        int b = 67890;
        long res = sample.op(Sample.Operation.MULT, a, b);
        Assertions.assertEquals(res, 838102050);
    }

    @Test
    void op_big_add_neg() {
        Sample sample = new Sample();
        int a = -4266846;
        int b = 24686432;
        long res = sample.op(Sample.Operation.ADD, a, b);
        Assertions.assertEquals(res, 20419586);
    }

    @Test
    void op_big_mult_neg() {
        Sample sample = new Sample();
        int a = 12345;
        int b = -67890;
        long res = sample.op(Sample.Operation.MULT, a, b);
        Assertions.assertEquals(res, -838102050);
    }

    @Test
    void op_big_add_neg_result() {
        Sample sample = new Sample();
        int a = -42668469;
        int b = 24686432;
        long res = sample.op(Sample.Operation.ADD, a, b);
        Assertions.assertEquals(res, -17982037);
    }

    @Test
    void fact_basic() {
        Sample sample = new Sample();
        int number = 3;
        long res = sample.fact(number);
        Assertions.assertEquals(res, 6);
    }

    @Test
    void fact_by_0() {
        Sample sample = new Sample();
        int number = 0;
        long res = sample.fact(number);
        Assertions.assertEquals(res, 1);
    }

    @Test
    void fact_by_5() {
        Sample sample = new Sample();
        int number = 5;
        long res = sample.fact(number);
        Assertions.assertEquals(res, 120);
    }

    @Test
    void fact_by_10() {
        Sample sample = new Sample();
        int number = 10;
        long res = sample.fact(number);
        Assertions.assertEquals(res, 3628800);
    }

    @Test
    void fact_neg() {
        Sample sample = new Sample();
        int number = -5;
        Assertions.assertThrows(IllegalArgumentException.class, () -> sample.fact(number), "fact by -5");
    }

    @Test
    void fact_big_neg() {
        Sample sample = new Sample();
        int number = -69;
        Assertions.assertThrows(IllegalArgumentException.class, () -> sample.fact(number), "fact by -69");
    }

    @Test
    void test_op_add_and_fact() {
        Sample sample = new Sample();
        int a = 1;
        int b = 5;
        long fact_res = sample.fact(sample.op(Sample.Operation.ADD, a, b));
        Assertions.assertEquals(fact_res, 720);
    }

    @Test
    void test_op_mult_and_fact() {
        Sample sample = new Sample();
        int a = 1;
        int b = 5;
        long fact_res = sample.fact(sample.op(Sample.Operation.MULT, a, b));
        Assertions.assertEquals(fact_res, 120);
    }

    @Test
    void test_op_add_neg_and_fact() {
        Sample sample = new Sample();
        int a = -1;
        int b = 5;
        long fact_res = sample.fact(sample.op(Sample.Operation.ADD, a, b));
        Assertions.assertEquals(fact_res, 24);
    }

    @Test
    void test_op_mult_neg_and_fact() {
        Sample sample = new Sample();
        int a = -1;
        int b = 5;
        Assertions.assertThrows(IllegalArgumentException.class,
            () -> sample.fact(sample.op(Sample.Operation.MULT, a, b)),"fact by -5");
    }

}
