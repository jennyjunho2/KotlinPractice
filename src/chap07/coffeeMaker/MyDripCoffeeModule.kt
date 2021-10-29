package chap07.coffeeMaker

class MyDripCoffeeModule : CoffeeModule {
    companion object {
        val electricHeater by lazy {
            ElectricHeater()
        }
    }

    private val _thermosiphon : Thermosiphon by lazy {
        Thermosiphon(electricHeater)
    }

    override fun getThermosiphon(): Thermosiphon {
        return _thermosiphon
    }
}