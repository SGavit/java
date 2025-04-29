Queue 

🔁 Circular Queue Logic:
The use of (index + 1) % capacity for front and rear makes this a circular queue, which reuses empty slots and avoids shifting elements manually.

🔁 What's Happening Here?
This line moves the rear pointer to the next position in the array. But instead of going out of bounds when it reaches the end of the array, it wraps around to the beginning — like a circle.
✅ Example:
Let’s say:
capacity = 5
rear = 4 (last index of the array)

Now when you do:
rear = (rear + 1) % capacity;  // (4 + 1) % 5 = 0
rear becomes 0 → it wraps around to the beginning of the array!
Awesome! Here's a step-by-step visual representation of how a circular queue works using the formula:

java
Copy
Edit
rear = (rear + 1) % capacity;
front = (front + 1) % capacity;
We'll use an array of size 5.

🧱 Initial State

Index	0	1	2	3	4
Value					
front = 0

rear = -1

size = 0

🟩 Step 1: Enqueue 10
java
Copy
Edit
rear = (rear + 1) % 5 → (−1 + 1) % 5 = 0

Index	0	1	2	3	4
Value	10				
front = 0

rear = 0

size = 1

🟩 Step 2: Enqueue 20
java
Copy
Edit
rear = (0 + 1) % 5 = 1

Index	0	1	2	3	4
Value	10	20			
front = 0

rear = 1

size = 2

🟩 Step 3: Enqueue 30
java
Copy
Edit
rear = (1 + 1) % 5 = 2

Index	0	1	2	3	4
Value	10	20	30		
front = 0

rear = 2

size = 3

🟥 Step 4: Dequeue
java
Copy
Edit
front = (0 + 1) % 5 = 1

Index	0	1	2	3	4
Value	X	20	30		
front = 1

rear = 2

size = 2

(10 is logically removed, so we mark it as X)

🟩 Step 5: Enqueue 40
java
Copy
Edit
rear = (2 + 1) % 5 = 3

Index	0	1	2	3	4
Value	X	20	30	40
front = 1

rear = 3

size = 3

🟩 Step 6: Enqueue 50
java
Copy
Edit
rear = (3 + 1) % 5 = 4

Index	0	1	2	3	4
Value	X	20	30	40	50
front = 1

rear = 4

size = 4

🟩 Step 7: Enqueue 60
java
Copy
Edit
rear = (4 + 1) % 5 = 0  ← WRAPS AROUND!

Index	0	1	2	3	4
Value	60	20	30	40	50
front = 1

rear = 0

size = 5 ✅ Full now

Now the rear has looped back to the start of the array, using that previously dequeued spot!

🚫 Step 8: Try Enqueue Again
Queue is full: cannot enqueue more until dequeuing.

Summary:
Using % capacity makes the array act like a circular buffer so you never waste space and never shift elements manually.