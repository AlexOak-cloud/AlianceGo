
![](https://github.com/AlexOak-cloud/AlianceGo/blob/main/app/src/main/res/drawable/img.png)



Go

Это приложение будет называться Go.
Компания которая разрабатывает это приложения называеться Aliance.
Если вы это читаете, скорее всего вы один из основателей большого дело, которое будет помагать людям становиться лучше.


Приложение гоу, это приложение, которое будет составлять и проводить короткосрочные тренеровки в домашних условиях, высоой интенсивности.

Существует определенная база упрожнений (представлена ниже), заходя в которую, скрипт, каждый день, составляет уникальню тренеровку. 

 1.1  "Прыжки с разведением рук", 
 1.2 "Бег на месте, высоко поднимая колено"
 1.3 "Выпрыгивание с упора лежа"

 2.11 "Поднятие ног из позиции лежа "
  2.12 "Велосипед"
   2.13 "Бег в планке"
   2.14 "Русские покачивания"
   2.15 "Боковые касания пола тазом из планки"
   2.16 "Велосипед (очень медленно)"
   2.17 "Поднятия головы из положения лежа"
    2.18 "Поднятия туловища из положения лежа"
    2.19 "Поднятия туловища локти/колени"
    2.20 "Махи ногами из положеня лежa"
    2.21 "Сгибание туловища положение лежа кисти/ступни"
    2.22 "Поднятия туловища вверх из положения на боку"
    2.23 "Выпрыгивание, раскидкa ног из положения планки"


    3.1 "Отжимания"
    3.2 "Отжимания широкий жим"
    3.3 "Отжимания, ноги выше плечей"
    3.4 "Отжимания узким жимом"
    3.5"Отжимания чередуя узкий жим на широкий"
    3.6 "Отжимания от в упоре полу лежа от обьекта "
    3.7 "Отжимание слева направо и наоборот"


    4.1 "Супермен"
    4.2 "Подтягивание полотенце лежа"
    4.3 "Амплетудное разведение рук с задержкой в конце"
    4.4 "Качели в супермене"
    4.5 "Приседания"
    4.6 "Взрывные вырыгивание, с задержкой в присяде"
    4.7 "Приседание + носки"
    4.8 "Медленные приседания + медленный подьем + носки "


    5.1 "Быстрый бег на месте"
    5.2 "Планка"


Как мы можем заметить, каждое упрожнение, имеет уникалыный номер, который состоит из первого и второго значения, разделяющимися точкой.
Первое значение указывает о принадлежности этого упрожнения, к какой то группе. 
1 - разогревка
2 - пресс
3 - руки
4 - спина
5 - закрепляющее фаза
Второе число, показывает индеведуальность упрожнения, уже в самой группе. Существует оно, по понятным причинам, для возможности обратиться к нему в интелекте приложения.



Дальее.
Мы состовляем тренеровку, которая будет длиться 10 минут.
45 секунд упрожнения
15 секунд отдых.


Карта тренеровки ( то по какому принципу составляеться тренеровка )

1 - разогревка
2 - пресс
2 - пресс
3 - отжимания
2 - пресс
2 - пресс
4 - руки
2 - пресс
2 - пресс
5 - закрепительная фаза






Дальше мы забираемся в наши файлы.
Все что необхадимо лежит в папке  /app
Далее мы должны понимать что в папке 
/app/res/layaut 
лежат вьюшки ( интерфейс страниц )

а в папке 
/app/java/com.exemple.aliancego/
лежат файлы с логикой для этох вьюшек
то есть получаеться, что каждая вьюшка связана с другим файлом, мозгами, для этой самой вьюшки,по принципу:
вью     activity_main.xml    <---->   MainActivity      мозги
вью     activity_training_page.xml   <---->   training_page    мозги
вью     activity_work_page.xml    <---->     work_page    мозги
Если открыть эти две папки, все понятно интуитивно    


activity_main.xml  ( страница выбора курса тренеровок, пока не обращаем внимание, единственное что, на этой странице мы переходим по кнопке комплексный подход, и начинаем работать от туда)

activity_training_page.xml  С этой страницы и начинаем работать
В логику этой страницы которая находиться в файле training_page нуэно добавить 5 массивов обьектов.    
Эти массивы, есть упрожнения, которые представлены выше.
Каждый массив будет захватывать упрожнения одного характера ( тоесть один массив, только разогревка, второй только пресс, третий только руки и тд.).

Когда массивы созданы, нам понадобиться один пустой массив, который будет принимать в себя нашу тренеровку. Условно назовем его VoidArr

Далее, необходим скрипт который, залазит в
Скрипт заходит в первый массив достает от туда рандомное упрожнение , и передает его в нашь пустой массив
Скрипт заходит во второй массив достает от туда рандомное упрожнение , и передает его в нашь пустой массив
Скрипт заходит во второй массив достает от туда рандомное упрожнение , и передает его в нашь пустой массив
Скрипт заходит в третий массив достает от туда рандомное упрожнение , и передает его в нашь пустой массив
Скрипт заходит во второй массив достает от туда рандомное упрожнение , и передает его в нашь пустой массив
Скрипт заходит во второй массив достает от туда рандомное упрожнение , и передает его в нашь пустой массив
Скрипт заходит в четвертый массив достает от туда рандомное упрожнение , и передает его в нашь пустой массив
Скрипт заходит во второй массив достает от туда рандомное упрожнение , и передает его в нашь пустой массив
Скрипт заходит во второй массив достает от туда рандомное упрожнение , и передает его в нашь пустой массив
Скрипт заходит в пятый массив достает от туда рандомное упрожнение , и передает его в нашь пустой массив

Таким образом и появляеться тренеровка
1 - разогревка
2 - пресс
2 - пресс
3 - отжимания
2 - пресс
2 - пресс
4 - руки
2 - пресс
2 - пресс
5 - закрепительная фаза


После чего, мы сделаем так, что бы уже составленая тренеровка показывалась списком на экране.

Далее остаеться только ознакомиться с тренеровкойи нажать на кнопку "ПРиступим", которая отправит нас на стрницу actiity_traning_page.xml

  
activity_work_page.xml 
Логика этой страницы, находится в файле work_page
Логика этой страницы, состоит из двух компонентов.

Первый комонент Таймер
Его алгоритм будет таков
Как только человек переходит на эту страницу, начинаеться отсчет
Подготовка 10 секунд, что бы человек принял удобное место, положил телефон поудобнее, и тд и тп.
После этого начинаеться первое упрожнения 45 сек
45сек прошло - 15 сек отдых, и так 10 раз соответственно

Формула 
10сек  --->   (45 -> 15) *10

После  чего выведем это на экран.


Второй компонент Зависимость массива VoidArr от таймера

Дело тут таково. 
Нам нужно передать массив VoidArr, тоесть уже составленную тренеровку на страннице treining_page, на данную страницу  work_page.

Следующим шагом будет привязка этого массива к таймеру, таким образом что бы упрожнения, соответственно времени, показывались и менялись на экране.

То есть

 1.      10 сек ( разогревочные ) + 45сек (упрожнения)  первое упражнение
упражнение поменялось
2 .       15 сек (отдых) + 45 секунд (упражнения) второе упражнение
упражнение поменялось
3.       15 сек (отдых) + 45 секунд (упражнения) --------> третье упражнение
упражнения поменялос
и тд.
После этого мы вывидим названия упражнений на экран, выведем таймер на экран, и все это красиво сделаем.
Тогда демо версия приложеня будет готова, и мы выпустим первую версию приложения.


Во второй версии упражнения, мы
Наймем человека который сделает нам видео, под нашим чутким руководством, и добавим их в приложения, что бы пользователи не заморачивались с заучением названий, да и вообще что бы это все было качественно сделано.
Добавим хороший дизайн, и есть еще пару хороших идей, которых я опишу потом в этом же документе.






Заметки разработчиков.
