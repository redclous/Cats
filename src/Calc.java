public class Calc {
    int add(int a, int b){
    int result = a+b;
    return result;
    }
    int multiply (int a, int b)
    {
        int result = a* b;
        return result;
    }
    double absolute(double a){
        if (a>=0)
        {
            return a;
        }
        else
        {
            return -a;
        }
    }
}
