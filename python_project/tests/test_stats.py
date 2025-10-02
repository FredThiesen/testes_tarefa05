from python import stats

def test_moving_average_basic():
    assert stats.moving_average([1,2,3,4], window=2) == [1.0, 1.5, 2.5, 3.5]

def test_normalize_regular():
    vec = [1, 1, 2]
    out = stats.normalize(vec)
    assert round(sum(out), 6) == 1.0
