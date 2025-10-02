import pytest
from python_project import calculator as calc

def test_add_and_subtract():
    assert calc.add(3, 4) == 7
    assert calc.subtract(10, 3) == 7

def test_multiply_regular():
    assert calc.multiply(3, 4) == 12

def test_divide_safe_zero():
    assert calc.divide(10, 0, safe=True) is None

def test_grade_some_branches():
    assert calc.grade(95) == 'A'
    assert calc.grade(83) == 'B'
    assert calc.grade(10) == 'F'
