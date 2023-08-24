Урок 6. Хранение и обработка данных ч3: множество коллекций Set
Создать собственный класс, описывающий Лифт.
У класса должно быть приватное поле, указывающее на текущий этаж.
У класса должен быть 2 конструктора:
1. принимающий диапазон минимального и максимального значения лифта.
2. принимающий максимальное значение. в этом случае минимальное значение = 1
По умолчанию лифт находится в позиции минимального этажа.

У класса должен быть метод move(int floor), который меняет состояние лифта и отвозит его на указанный этаж.

Пример кода:
Elevator elevator = new Elevator(2, 7); // лифт находится в позиции 2
elevator.move(4); // лифт поднялся на 4 этаж

Доп. задание:
Добавить проверку аргументов конструктора и метода move:
1. В констукторе запретить создавать лифт, у которого minFloor >= maxFloor
2. В методе move запретить перемещаться на этаж, который не входит в допустимый диапазон

По желанию, можно определить метод toString, в котором будет возвращаться диапазон и текущий этаж.
Пример: [1, 10] -> 3
