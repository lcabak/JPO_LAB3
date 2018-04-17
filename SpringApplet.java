class SpringApplet extends javax.swing.JApplet{
    
    public void init() //przeciazenie init
    {
       Vector2D vectorAB = new Vector2D(5,5);
       Vector2D vectorCD = new Vector2D(3,1);
       
       Vector2D Sum = vectorAB.Sum(vectorCD);
       Vector2D Substract = vectorAB.Substract(vectorCD);
       Vector2D normalizedVectorAB = vectorAB.Normalize();
       Vector2D normalizedVectorCD = vectorCD.Normalize();
       double lenghtOfAB = vectorAB.vectorLenght();
       double lenghtOfCD = vectorCD.vectorLenght();
       Vector2D Multiplication = vectorAB.Multiply(3);
    }

    public void paint(){ //przeciazenie paint
    }

}
