fun main(){
    var age= arrayOf(1,2,3)
    age.set(2,6)
    println("First element of Array= " + age[0])
    println("Second element of Array= " + age[1]) 
    println("Third element of Array= " + age[2]) 
    
    println("______________________________________")

    var cars=arrayOf("BMV","movie","kotlin")
    println("First element of Array= " + cars[0])
    println("Second element of Array= " + cars.get(1))
    println("Third element of Array= " + cars[2])

    cars.set(2, "Ford")

    println("________________________________-")

    println("size of cars array= " + cars.size)

}