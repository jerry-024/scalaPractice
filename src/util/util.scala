package object stringUtil{
   
  implicit class StringImprovements(s: String) {
    
	  def increment = s.map(c => (c + 1).toChar)
   
  }

}