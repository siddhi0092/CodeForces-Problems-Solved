# A social Experiment (2184-A)

# t = int(input())

# for _ in range(t):
#     n = int(input())
    
#     if n == 2:
#         print(2)
#     elif n % 2 == 0:
#         print(0)
#     else:
#         print(1)

t = int(input())

for _ in range(t):
    n = int(input())
    
    if n <= 3:
        print(n)
    elif n % 2 == 0:
        print(0)
    else:
        print(1)
