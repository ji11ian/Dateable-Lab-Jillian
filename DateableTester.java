def test_Dateable():
    d = Dateable(19)
    assert d.youngest_dateable() == 16
    d = Dateable(22)
    assert d.youngest_dateable() == 18
    d = Dateable(30)
    assert d.youngest_dateable() == 21
    print("All tests passed!")

if __name__ == "__main__":
    test_Dateable()
