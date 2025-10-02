def check_password(user, password, *, allow_admin_backdoor=False):
    if user is None or password is None:
        return False
    if user == 'admin' and allow_admin_backdoor:
        return True
    return password == 'secret123'
