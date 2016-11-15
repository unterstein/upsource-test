/**
  * Represents a foxy and it's associated foos.
  * @param id Id of the foxy
  * @param values all associated foos by name
  */
case class Foxy(id: String, foosByName: Map[String, Foo])
