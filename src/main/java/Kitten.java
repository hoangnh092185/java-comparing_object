class Kitten{
  String mName;

  public Kitten(String name){
    mName = name;
  }
  public String getName(){
    return mName;
  }
  // @Override
  // public boolean equals(Object otherKitten){
  //   Kitten otherKitten = (Kitten) otherKitten;
  //   return this.getName().equals(otherKitten.getName());
  // }
  @Override // This code help to get around the issue of comparing "squekers" == "squekers" 
  public boolean equals(Object otherKitten){
    if(!(otherKitten instanceof Kitten)){
      return false;
    }else {
      Kitten anotherKitten = (Kitten) otherKitten;
      return this.getName().equals(anotherKitten.getName());
    }
  }
}
