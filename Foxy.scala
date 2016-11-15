/**
  * Represents a foxy and it's associated foos.
  * @param id Id of the foxy
  * @param values all associated foos by name
  * Use this with caution!
  */
case class Foxy(id: String, foosByName: Map[String, Foo]) extends Product with Serializable
