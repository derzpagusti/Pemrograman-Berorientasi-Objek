package jobsheet7.task;

public class Segitiga 
{
    int sudut;
    
    int totalSudut (int sudutA)
        { return sudut = 180 - sudutA; }
    
    int totalSudut (int sudutA, int sudutB)
        { return sudut = 180 - (sudutA + sudutB); }

    int keliling (int sisiA, int sisiB, int sisiC)
        { return sisiA + sisiB + sisiC; }
        
    double keliling (int sisiA, int sisiB)
        { return Math.sqrt(Math.pow(sisiA, 2)) + Math.sqrt(Math.pow(sisiB, 2)); }
}
