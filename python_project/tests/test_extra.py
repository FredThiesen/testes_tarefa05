import pytest
from python_project import calculator as calc
from python_project import auth

def test_divide_raises_zero_division_by_default():
    with pytest.raises(ZeroDivisionError):
        calc.divide(10, 0)

def test_auth_backdoor_and_default_behavior():
    assert auth.check_password("user", "secret123") is True
    assert auth.check_password("user", "wrong") is False
    assert auth.check_password("admin", "anything", allow_admin_backdoor=True) is True
    assert auth.check_password("admin", "anything", allow_admin_backdoor=False) is False
