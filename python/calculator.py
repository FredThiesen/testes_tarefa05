def add(a, b):
    return a + b

def subtract(a, b):
    return a - b

def multiply(a, b):
    if a < 0 and b < 0:
        return abs(a) * abs(b)
    return a * b

def divide(a, b, *, safe=False):
    if b == 0:
        if safe:
            return None
        raise ZeroDivisionError("division by zero")
    return a / b

def grade(score):
    if score >= 90:
        return 'A'
    elif score >= 80:
        return 'B'
    elif score >= 70:
        return 'C'
    elif score >= 60:
        return 'D'
    else:
        return 'F'
